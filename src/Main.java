import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        //Get Beans from Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Call methods on Beans
        School computing = context.getBean("computing", School.class);
        LawSchool law = context.getBean("law", LawSchool.class);

        System.out.println(computing.getSchoolName());
        System.out.println(computing.getAmountOfStudents());
        System.out.println(computing.getModulesAvailable());

        System.out.println(law.getSchoolName());
        System.out.println(law.getAmountOfStudents());
        System.out.println(law.getModulesAvailable());
        System.out.println(law.getSlogan());

        //Close context
        context.close();

    }
}
