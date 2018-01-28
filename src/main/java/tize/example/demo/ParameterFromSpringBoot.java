package tize.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

        import javax.servlet.http.HttpServletRequest;

@RestController
public class ParameterFromSpringBoot {


   // @RequestMapping("/getname")
   @RequestMapping("/getName")
    public String showWithName(@RequestParam("name") String name,@RequestParam("age") int age)
    {

        return name+" "+age;
    }

    @RequestMapping("/otherName")
    public String showWithName(HttpServletRequest aa)
    {

        String withName = aa.getParameter("yourname");
        if(withName==null)
            return "Just Hello";
        else return "Hello "+withName;
    }

    @RequestMapping("/getArea")
    public String rectangleArea(@RequestParam("length") int length, @RequestParam("width")int width){
String result="";
result+=(2*length)+ (2*width);
       return  "Area of the rectangle is " + result;
    }
}