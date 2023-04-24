package com.maxi.sistema.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//@Autowired
	//private UserService usrService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/* @Override
	public void run(String... args) throws Exception {
		
		User userTest = new User();
		userTest.setCpf("908.123.998-12");
		userTest.setNome("Amikel");
		userTest.setSobrenome("Maxi");
		userTest.setEmail("amikel@maxi.com");
		userTest.setTelefone("988319197");
		userTest.setPerfil("90812399812.jpg");
		userTest.setUserName("amikel");
		userTest.setPassword("12345");

		Role rol = new Role();
		rol.setRoleId(1L);
		rol.setNome("ADMIN");

		Set<UserRole> userRoles = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(rol);
		userRole.setUser(userTest);
		userRoles.add(userRole);

		User u1= usrService.saveUser(userTest, userRoles);
		System.out.println(u1.getNome()+" "+u1.getSobrenome());
	} */

}
