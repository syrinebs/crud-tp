package com.syrine.maquillage.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.syrine.maquillage.entities.Maquillage;
import com.syrine.maquillage.service.MaquillageService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class MaquillageRESTController {
@Autowired
MaquillageService maquillageService;
@RequestMapping(method = RequestMethod.GET)
public List<Maquillage> getAllMaquillage() {
return maquillageService.getAllMaquillage();
}

@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Maquillage getMaquillageById(@PathVariable("id") Long id) {
return maquillageService.getMaquillage(id);
 }

@RequestMapping(method = RequestMethod.POST)
public Maquillage createMaquillage(@RequestBody Maquillage maquillage) {
return maquillageService.saveMaquillage(maquillage);
}

@RequestMapping(method = RequestMethod.PUT)
public Maquillage updateMaquillage(@RequestBody Maquillage maquillage) {
return maquillageService.updateMaquillage(maquillage);
}

@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteMaquillage(@PathVariable("id") Long id)
{
maquillageService.deleteMaquillageById(id);
}

@RequestMapping(value="/maqsbrand/{idbrand}",method = RequestMethod.GET)
public List<Maquillage> getMaquillageByBrandId(@PathVariable("idbrand") Long idbrand) {
return maquillageService.findByBrandIdbrand(idbrand);
}

}