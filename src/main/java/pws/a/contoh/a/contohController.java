/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.a.contoh.a;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author NITRO
 */
@Controller
@ResponseBody
public class contohController {
    
    Barang data = new Barang();
    BarangJpaController actrl = new BarangJpaController();
    
    @RequestMapping("/getAll")
    public List<Barang> viewAll(){
        return actrl.findBarangEntities();
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteData(@PathVariable("id") int id){
        try{
             actrl.destroy(id);
             return id + "Deleted";
        }
        catch (Exception error){return id + "tidak ada";}
    }
}
