package UniversityJava.topics.javabeans.test;

import UniversityJava.topics.javabeans.PersonaBean;

public class TestJavaBeans {
    public static void main(String[] args) {
        /* Con JavaBeans se debe iniciar el objeto con el constructor vacío*/
        PersonaBean javaBean = new PersonaBean();
        javaBean.setNombre("Chris");
        javaBean.setApellido("Chillogalli");
        System.out.println(javaBean);
    }
}
