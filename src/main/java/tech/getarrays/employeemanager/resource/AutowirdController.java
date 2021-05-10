package tech.getarrays.employeemanager.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.getarrays.employeemanager.model.Animal;

import javax.jws.Oneway;

@RestController
@RequestMapping("/autowired")
public class AutowirdController {


//--------------Autowired by Qualifier annotation ---------
    @Qualifier("cat")
    @Autowired
    private Animal animal;

    @GetMapping
    public String FetchCharacteristic(){
        return animal.characteristics();
    }

//----------------Autowired by Name------------------------------------------

//    @Autowired
//    private Animal dog;
//
//    @GetMapping
//    public String AutowiredByName(){
//        return dog.characteristics();
//    }

// ------------------Autowired by setter--------------------------------------------

//  private Animal animall;
//
//    @Autowired
//    public void setAnimal(@Qualifier("dog") Animal animall){
//        this.animall = animall;
//    }
//
//    @GetMapping
//   public String getBySetter(){
//        return animall.characteristics();
//   }

    // --------------------------------------------------------------

//   private Animal animal;
//
//   @Autowired
//    AutowirdController(@Qualifier("dog") Animal animal){
//     this.animal = animal;
//    }
//
//
//    @GetMapping
//    public String AutowiredByName(){
//        return animal.characteristics();
//    }
}
