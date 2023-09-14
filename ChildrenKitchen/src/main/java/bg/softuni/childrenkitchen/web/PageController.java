package bg.softuni.childrenkitchen.web;

import bg.softuni.childrenkitchen.model.CustomUserDetails;
import bg.softuni.childrenkitchen.model.binding.ChildRegisterBindingModel;
import bg.softuni.childrenkitchen.model.binding.UserRegisterBindingModel;
import bg.softuni.childrenkitchen.service.PointService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {
    private final PointService pointService;

    public PageController(PointService pointService) {
        this.pointService = pointService;
    }

    @GetMapping("/users/register")
    public String getRegister(){
        return "register";
    }

    @GetMapping("/users/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/admin")
    public String getAdminPanel(){
        return "admin";
    }

    @GetMapping("/admin/add-menu")
    public String getAddMenu(){
        return "add-menu";
    }

    @GetMapping("/admin/view-menu-by-date")
    public String getMenuByDate(){
        return "date-menu";
    }

    @GetMapping("/admin/add-recipe")
    public String addRecipe(){
        return "add-recipe";
    }

    @GetMapping("/admin/add-delete-order")
    public String getAddDeleteOrder(){
        return "add-delete-order";
    }

    @GetMapping("/about-us")
    public String getAboutUs(){
        return "about-us";
    }

    @GetMapping("/contacts")
    public String getContacts(){
        return "contacts";
    }

    @GetMapping("/e-kitchen")
    public String getEKitchen(){
        return "e-kitchen";
    }

    @GetMapping("/healthy-food")
    public String getHealthyFood(){
        return "healthy";
    }

    @GetMapping("/menus")
    public String getMenus(){
        return "menus";
    }


    @GetMapping("/users/profile/add-kid")
    public String addKidPage(){
        return "add-kid";
    }

    @ModelAttribute
    public UserRegisterBindingModel userRegisterBindingModel(){
        return new UserRegisterBindingModel();
    }

    @ModelAttribute
    public ChildRegisterBindingModel childRegisterBindingModel(){
        return new ChildRegisterBindingModel();
    }
}
