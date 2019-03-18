package SpringMVC.Controller;

import Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentController {
    
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
    
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    
    @RequestMapping("/student")
    public ModelAndView student(){
        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("Hello","Hello World");
        return modelAndView;
    }
    
    @RequestMapping("/flname/{firstName}/{lastName}")
    public void firstLastName(@PathVariable("firstName")String first,@PathVariable("lastName")String last){
        System.out.println(first + " " + last);
    }
    
    @RequestMapping("/firstlast/{firstName}/{lastName}")
    void returnCountryAndState(@PathVariable Map<String, String> requestMap) {
        System.out.println(requestMap.get("firstName") + " " + requestMap.get("lastName"));
    }
    
    @ResponseBody
    @RequestMapping(value = "/submit",method = RequestMethod.GET)
    String submit(@RequestParam("firstName")String first, @RequestParam("lastName")String last){
        System.out.println(first + " " + last);
        return first + " " + last;
    }
    
    @ModelAttribute
    void addHeading(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }
    
    @ResponseBody
    @RequestMapping("/submitStudent")
    ModelAndView submitObject(Student student){
        ModelAndView modelAndView = new ModelAndView("submitted");
        System.out.println(student.getFirstName() + " " + student.getLastName());
        //modelAndView.addObject(student);
        return modelAndView;
    }
}

