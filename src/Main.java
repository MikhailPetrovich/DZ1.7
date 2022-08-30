public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

  public static void task1() {



  String firstName =" Ivan ";
  String middleName = " Ivanovich ";
  String lastName = " Ivanov " ;

  String fullName = firstName + middleName + lastName;
  System.out.println("ФИО сотрудника -" + fullName );


    }

  public static void task2(){
      String fullName =  "Ivanov Ivan Ivanovich";

      String upperFullName = fullName.toUpperCase();

      System.out.println("Данные ФИО сотрудника для заполнения отчета — "+upperFullName );


  }

  public static void task3() {
      var fullName = "Иванов Семён Семёнович";
      var split = fullName.split(" ");
      String result="";
      for (String current :split){
          if (current.contains("ё")){
              var replacement =current.replace("ё", "е");
              result += replacement ;
          }else {
              //System.out.print(current);
              result += current;
          }
         result += " ";

      }
      System.out.printf("Данные ФИО сотрудника - %s", result );





  }

}

