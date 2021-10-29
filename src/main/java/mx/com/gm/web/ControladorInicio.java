package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import mx.com.gm.servicio.CategoriaService;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var categorias = categoriaService.listarCategorias();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("categorias", categorias);
        return "indexPersona";
    }
    
    @GetMapping("/agregar")
    public String agregar(Categoria categoria){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Categoria categoria){
        categoriaService.guardar(categoria);
        return "redirect:/";
    }
}
