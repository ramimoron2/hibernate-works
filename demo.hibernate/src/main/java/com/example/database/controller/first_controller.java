package com.example.database.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.hibernate.*;
import com.example.database.model.Answer;
import com.example.database.model.Answers;
import com.example.database.model.Emp;
import com.example.database.model.Hobbies;
import com.example.database.model.Question;
import com.example.database.model.Questions;
import com.example.database.model.Students;
import com.example.database.model.bottle;
import com.example.database.model.dept;
import com.example.database.repository.Student_repo;
import com.example.database.repository.answer_repo;
import com.example.database.repository.bottle_repo;
import com.example.database.repository.emp_repo;
import com.example.database.repository.questions_repo;
import com.example.database.repository.repo;
import com.example.database.repository.second_repo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class first_controller {

	@Autowired
	repo r;

	@Autowired
	second_repo r1;

	@Autowired
	bottle_repo bottlerepo;

	@Autowired
	emp_repo emprepo;

	@Autowired
	answer_repo r2;

	@Autowired
	questions_repo r3;

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private Student_repo student_repo;

	@RequestMapping("/add_people")
	public String add() {
		dept d = new dept();
		d.setDEPTNO("40");
		d.setDNAME("faltu");
		d.setLOC("kolkata");

		r.save(d);
		return "success";
	}

	@RequestMapping("/add_answer")
	public String add_answers() {

		Answer ans1 = new Answer();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("Ravi Malik");

		Answer ans2 = new Answer();
		ans2.setAnswername("Java is a platform");
		ans2.setPostedBy("Sudhir Kumar");

		Answer ans3 = new Answer();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Jai Kumar");

		Answer ans4 = new Answer();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Arun");

		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);

		ArrayList<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);

		Question question1 = new Question();
		question1.setQname("What is Java?");
		question1.setAnswers(list1);

		Question question2 = new Question();
		question2.setQname("What is Servlet?");
		question2.setAnswers(list2);

		r1.save(question1);
		r1.save(question2);

		/*
		 * Answer ai = new Answer(); ai.setAnswername("angular is framework");
		 * ai.setQid(6); ai.setPostedBy("boni");
		 * 
		 * r2.save(ai);
		 */

		return "success";
	}

	@RequestMapping("/add_bottle")
	public String add_bottle() {
		bottle obj = new bottle();
		obj.setId(1);
		obj.setName("minearal");
		bottlerepo.save(obj);
		return "success";
	}

	@RequestMapping("/add_emp")
	public String add_emp() {

		Emp obj = new Emp();
		obj.setEMPNO(2002);
		obj.setDEPTNO(20);
		obj.setENAME("bunty");
		obj.setCOMM(new Float(300));
		obj.setSAL(new Float(300));
		emprepo.save(obj);

		return "success";
	}

	@RequestMapping("/dothings")
	public List<Emp> dothings() {
		List<Emp> emp = emprepo.getAllemp(new Float(1000));

		return emp;

	}

	@RequestMapping("/getByjobs")
	public List<Emp> getbyjobs() {

		// List<Emp> emp=emprepo.getByJob("CLERK");
		Session current = entityManager.unwrap(Session.class);
		org.hibernate.query.Query q = current.createQuery("from Emp");

		return q.list();

	}

	@GetMapping("/getAllEmployeeBYID/{empno}")
	public List<Emp> getEmployee(@PathVariable String empno) {

		Emp oneEmployee = emprepo.getOne(Integer.parseInt(empno));
		// List<Emp> emplist= emprepo.getByJob(empno));

		// emplist.add(oneEmployee);

		try {
			System.out.println("value=" + new ObjectMapper().writeValueAsString(oneEmployee));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(oneEmployee);
	}

	@GetMapping("/getEmployeeAll")
	public List<Emp> getAllEmployee() {
		List<Emp> allEmployee = emprepo.findAll();

		return allEmployee;

	}

	@RequestMapping("/saveEmployee")
	public Emp saveEmployee(@RequestBody JsonNode json) {

		Emp employee = new ObjectMapper().convertValue(json, Emp.class);

		emprepo.save(employee);

		return employee;

	}

	@RequestMapping("/testing")
	public Object testing() {
		// emprepo.get

		/*
		 * Session session = entityManager.unwrap(Session.class); Query
		 * query=session.createQuery("from Emp"); List list= query.list();
		 */

		
		  
		  Pageable secondPageWithFiveElements = PageRequest.of(0,1);
		  
		  
		  
		  List values=emprepo.getEmployees(secondPageWithFiveElements);
		 

		return values;
	}

	@RequestMapping("/deleteQuestions")
	public String deletequestions() {
		Question que = r1.getOne(Integer.parseInt("7"));
		r1.delete(que);
		// r1.deleteById(id);
		return null;

	}

	@RequestMapping("/addQuestions")
	public String addQuestions() {
		Answers ans1 = new Answers();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("Ravi Malik");

		Answers ans2 = new Answers();
		ans2.setAnswername("Java is a platform");
		ans2.setPostedBy("Sudhir Kumar");

		Answers ans3 = new Answers();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Jai Kumar");

		Answers ans4 = new Answers();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Arun");

		ArrayList<Answers> list1 = new ArrayList<Answers>();
		list1.add(ans1);
		list1.add(ans2);

		ArrayList<Answers> list2 = new ArrayList<Answers>();
		list2.add(ans3);
		list2.add(ans4);

		Questions question1 = new Questions();
		question1.setQname("What is Java?");
		question1.setAnswers(list1);

		Questions question2 = new Questions();
		question2.setQname("What is Servlet?");
		question2.setAnswers(list2);

		r3.save(question1);
		r3.save(question2);

		return "success";
	}

	@RequestMapping("/insertStudentDetails")
	public String insertToStudent(@RequestBody Students students) {

		/*
		 * Students stu = new Students();
		 * 
		 * 
		 * List<Hobbies> hob=students.getHobbies(); stu.setHobbies(hob);
		 * stu.setName(students.getName());
		 */
		student_repo.save(students);

		return "successfully saved in the db";

	}

}
