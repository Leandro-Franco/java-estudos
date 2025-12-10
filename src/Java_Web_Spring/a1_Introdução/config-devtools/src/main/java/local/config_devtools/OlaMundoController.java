package local.config_devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {
  @RequestMapping("/ola")
  @GetMapping
  public String dizOla() {
    return "Olá, mundo!!!!";
  }

  @RequestMapping("/adeus")
  public String dizAdeus() {
    return "Adeus mundo!!!!";
  }
}