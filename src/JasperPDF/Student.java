//package JasperPDF;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Student {
//    public Student(long id, String firstName, String lastName, String street, String city) {
//        super();
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.street = street;
//        this.city = city;
//    }
//    private long id;
//    private String firstName;
//    private String lastName;
//    private String street;
//    private String city;
//
//    public static void main(String[] args) {
//        try {
//            String filePath = "C:\\Users\\NEW\\Desktop\\billingProject"
//                    + "\\main\\src\\main\\resources\\FirstReport.jrxml";
//
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("studentName", "peter");
//            Student student1 = new Student(1L, "Raj"," Kumar", "Anna Nagar", "Delhi");
//            Student student12 = new Student(1L, "Raja"," Kumari", "Anna Nagar", "Pune");
//            Student student3 = new Student(1L, "Raj"," KumarDas", "Neru Nagar", "Trichy");
//            Student student4 = new Student(1L, "vetri","Selvan", "Gandhi Nagar", "Nellai");
//            Student student5 = new Student(1L, "Ananth"," Kumar", "kamaraj Nagar", "Bengaluru");
//            List<Student> stList = new ArrayList<>();
//            stList.add(student1);
//            stList.add(student12);
//            stList.add(student3);
//            stList.add(student4);
//            stList.add(student5);
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(stList);
//
//            JasperReport report = JasperCompileManager.compileReport(filePath);
//
//            JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
//            JasperExportManager.exportReportToPdfFile(print,"C:\\Users\\NEW\\Desktop\\ebrain\\FirstReport.pdf");
//            System.out.println("Report created");
//        } catch (Exception e) {
//
//            // TODO: handle exception
//            System.out.println("exception occurs");
//        }
//    }
//}
//
