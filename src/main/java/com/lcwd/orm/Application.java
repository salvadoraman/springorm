package com.lcwd.orm;

import com.lcwd.orm.entities.*;
import com.lcwd.orm.repository.CategoryRepository;
import com.lcwd.orm.repository.ProductRepository;
import com.lcwd.orm.repository.StudentRepository;
import com.lcwd.orm.service.userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.PropertyPermission;

@SpringBootApplication
public class Application implements CommandLineRunner {
	Logger logger=LoggerFactory.getLogger(Application.class);


	//get implementation of student repository
	@Autowired
	private StudentRepository studentrepository;
	@Autowired
	private userservice Userservice;
	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//abhi controller ka use nhi krrhe hum to dummy bna rhe;
//		User user=new User();
//		//user.setId("123");
//		user.setName("vaivj");
//		user.setAge(121);
//		user.setCity("noida");
//		User u1=Userservice.saveuser(user);
//		System.out.println(u1);

		//get allusers
//		List<User> users=Userservice.getAllUser();
//		System.out.println(users);
//
//		//get single users:
//		User u1=Userservice.getSingleUser(1);
//		logger.warn("single user is {}",u1);

		//for update we have to create
//		User user=new User();
//		user.setName("Aman raj");
//		user.setAge(22);
//		user.setCity("kolkata");
//
//		User user123=Userservice.updateuser(user,1);
//		logger.info("updated user is {}",user123);

		//for deleteing
	//	Userservice.deleteUser(1);

		//ye area student wala hai

//      Student st=new Student();
//	  st.setName("Aman raj");
//	  st.setAbout("I ama a software enginner hai");
//	  st.setStudentid(2);



	  //for laptops
//		Laptops lt=new Laptops();
//		lt.setLaptop_id(123);
//		lt.setModel("Mu1234");
//		//it is imporatnt to set mapped student
//		lt.setStudent(st);
//		st.setLaptop(lt);


//		Student st1=studentrepository.save(st);
//		logger.info("student {}",st1.getName());

		//now instead of doing ...below action
		//laptoprepostory.save(lt);
		//we can use cascade

//........................................................................................................

		//One to many
		//for address
//		Address a1=new Address();
//		a1.setAddress_id(89);
//		a1.setCity("hzb");
//		a1.setState("jharkhand");
//		a1.setCountry("india");
//		a1.setStudent(st);
//
//
//
//
//		Address a2=new Address();
//		a2.setAddress_id(124);
//		a2.setCity("patna");
//		a2.setState("bihar");
//		a2.setCountry("india");
//        a2.setStudent(st);
//		List<Address>addressList=new ArrayList<>();
//		addressList.add(a1);
//
//		addressList.add(a2);
//
//		//har student ke pass address list hai
//		st.setAddressList(addressList);
//
//		Student save=studentrepository.save(st);
//		logger.info("Student address created {}");


//................................................................................................

		Product product=new Product();
		product.setProdid("123");
		product.setProdname("iphone14");


		Product p2=new Product();
		product.setProdid("456");
		product.setProdname("samsung13");



		Product p3=new Product();
		product.setProdid("67");
		product.setProdname("iphone12");








		//for category

		Category c1=new Category();
		c1.setCid("cid1");
		c1.setCatname("Electronics");

		Category c2=new Category();
		c2.setCid("cid2");
		c2.setCatname("Mobilephones");


		//we will take out category1 products

		List<Product>categoryProduct=c1.getProductList();
		categoryProduct.add(product);
		categoryProduct.add(p2);
		categoryProduct.add(p3);

		List<Product>category2=c2.getProductList();
		category2.add(p3);
		//category2.add(p4);
		categoryRepository.save(c1);
		categoryRepository.save(c2);






	}
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
}
