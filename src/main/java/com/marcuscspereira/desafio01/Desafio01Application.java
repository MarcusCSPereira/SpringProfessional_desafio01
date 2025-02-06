package com.marcuscspereira.desafio01;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcuscspereira.desafio01.entities.Order;
import com.marcuscspereira.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

  @Autowired
  private OrderService orderService;

  @Override
  public void run(String... args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o código do pedido:");
    int orderCode = scanner.nextInt();
    System.out.println("Digite o valor básico do produto:");
    double orderBasic = Double.parseDouble(scanner.next());
    System.out.println("Digite a porcentagem de desconto do produto:");
    double orderDiscount = Double.parseDouble(scanner.next());
    scanner.close();

    Order order = new Order(orderCode,orderBasic,orderDiscount);

    System.out.printf("Pedido código %d%n", order.getCode());
    System.out.printf("Valor total : R$ %.2f", orderService.total(order));
  }

}
