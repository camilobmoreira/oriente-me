package br.gov.sp.fatec.orienteme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Controller
@Configuration
@EnableSwagger2
public class Boot
{

   public static void main(String[] args)
   {
      SpringApplication.run(Boot.class, args);
   }

   @GetMapping("/")
   @ResponseBody
   public String home()
   {
      return "home";
   }
}
