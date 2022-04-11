package com.sapient.day3;

public class AbstractClasses {
	abstract class Person {
		String name;

		abstract void work();

		void eat() {
			System.out.println("eating");
		}
	}

	class Employee extends Person {// concrete class

		@Override
		void work() {
			System.out.println("working as an IT engineer");
		}

	}

	class Manager extends Person {// concrete class

		@Override
		void work() {
			System.out.println("working as an IT Manager");
		}

	}

	public class Abstraction {
		public static void main(String[] args) {
//			Person p1 = new Person();
			create();
			
		}

		private static void create() {
			Person engineer = new Employee();
			engineer.eat();
			engineer.work();
			Person manager = new Manager();
			manager.eat();
			manager.work();		
		}
	}

}
