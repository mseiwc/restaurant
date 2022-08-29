package th.ac.ku.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // เหมือน RestController ใน MenuController
public class HomeController {

    @RequestMapping("/")
    // คืนค่าเป็น string เสมอ
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Bello"); // (key=greeting, value=Sawaddee)
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home"; // return ไปหน้า "home.html"
    }
}
