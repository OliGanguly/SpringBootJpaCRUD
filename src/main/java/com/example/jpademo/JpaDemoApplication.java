package com.example.jpademo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.jpademo.dao.UserRepo;
import com.example.jpademo.entities.User;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
		UserRepo userrepo = context.getBean(UserRepo.class);
		
//		User user1= new User();
//		//create single entity
//		user1.setName("oli");
//		user1.setCity("canada");
//		
//		User user2= new User();
//		//create single entity
//		user2.setName("sonnet");
//		user2.setCity("canada");
//		
////		User user2=userrepo.save(user1);
////		System.out.println(user2);
//				
//		//create more than one entity
//		List<User> users = List.of(user1,user2);
//		
//		Iterable<User> result = userrepo.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		//update
//		Optional<User> optional = userrepo.findById(2);
//		User user=optional.get();
//		user.setName("titly");
//		user.setCity("india");
//		userrepo.save(user);
	
		
		//delete
//		userrepo.deleteById(2);
//		
//		List<User> u1 = userrepo.findByName("sonnet");
//		u1.forEach(e->{
//			System.out.println(e);
//		});
		
//		List<User> result = userrepo.findByCity("canada");
//		result.forEach(n->{
//            System.out.println(n);
//            
//        });
        
		List<User>u2=userrepo.getUserByName("oli");
		u2.forEach(n->{
            System.out.println("llll"+n);
            
        });
		
		
		
	}

}
