package company.com;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      //Задача А
      Student student1 = new Student();
      student1.speciality = "Management";
      student1.year = 2;
      student1.age = 21;
      student1.country = "Russian";
      student1.performance = "satisfactorily";
      System.out.println("Student1:\nSpeciality: " + student1.speciality + "\nYear: " + student1.year + "\nAge: " + student1.age + "\nCountry: " + student1.country + "\nPerformance: " + student1.performance);

      Student student2 = new Student();
      student2.speciality = "Economy";
      student2.year = 3;
      student2.age = 22;
      student2.country = "Korean";
      student2.performance = "excellent";
      System.out.println("Student2:\nSpeciality: " + student2.speciality + "\nYear: " + student2.year + "\nAge: " + student2.age + "\nCountry: " + student2.country + "\nPerformance: " + student2.performance);

      Student student3 = new Student();
      student3.speciality = "Jurisprudence;";
      student3.year = 4;
      student3.age = 23;
      student3.country = "Kyrgyz";
      student3.performance = "satisfactorily";
      System.out.println("Student3:\nSpeciality: " + student3.speciality + "\nYear: " + student3.year + "\nAge: " + student3.age + "\nCountry: " + student3.country + "\nPerformance: " + student3.performance);
        //Задача Б
      Phone phone1 = new Phone();
      phone1.company =  "Samsung";
      phone1.name = " Samsung A6";
      phone1.year = 2019;
      phone1.country = "Korea";
      phone1.price = 30000;
      System.out.println("Phone1:\nКомпания: " + phone1.company+ "\nНазвание: "+ phone1.name + "\nГод: "+ phone1.year + "\nСтрана: "+ phone1.country+ "\nЦена: "+ phone1.price);

   Phone phone2 = new Phone();
      phone2.company =  "Apple";
      phone2.name = " Iphone11Pro";
      phone2.year = 2020;
      phone2.country = "USA";
      phone2.price = 100000;
      System.out.println("Phone2:\nКомпания: " + phone2.company+ "\nНазвание: "+ phone2.name + "\nГод: "+ phone2.year + "\nСтрана: "+ phone2.country+ "\nЦена: "+ phone2.price);

      Phone phone3 = new Phone();
      phone3.company =  "Xiaomi";
      phone3.name = " Redmi3";
      phone3.year = 2018;
      phone3.country = "Chine";
      phone3.price = 18000;
      System.out.println("Phone3:\nКомпания: " + phone3.company+ "\nНазвание: "+ phone3.name + "\nГод: "+ phone3.year + "\nСтрана: "+ phone3.country+ "\nЦена: "+ phone3.price);


   }
   }