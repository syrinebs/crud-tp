package com.syrine.maquillage;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.syrine.maquillage.entities.Brand;
import com.syrine.maquillage.entities.Maquillage;
import com.syrine.maquillage.repos.MaquillageRepository;
import java.util.List;

@SpringBootTest
class MaquillageApplicationTests {
@Autowired
private MaquillageRepository maquillageRepository;
@Test
public void testCreateMaquillage() {
Maquillage maq = new Maquillage("Anti cernes",32.200,new Date());
maquillageRepository.save(maq);
}
@Test
public void testFindMaquillage()
{
Maquillage m = maquillageRepository.findById(1L).get();
System.out.println(m);
}
@Test
public void testUpdateMaquillage()
{
Maquillage m = maquillageRepository.findById(1L).get();
m.setPrixMaquillage(20.0);
maquillageRepository.save(m);
}
@Test
public void testDeleteMaquillage()
{
maquillageRepository.deleteById(1L);;
}
@Test
public void testListerTousMaquillages()
{
List<Maquillage> maqs = maquillageRepository.findAll();
for (Maquillage m : maqs)
{
System.out.println(m);
}
}
@Test
public void testFindByNomMaquillage()
{
List<Maquillage> maqs = maquillageRepository.findByNomMaquillage("Fard à poupières");
for (Maquillage m : maqs)
{
System.out.println(m);
}
}
@Test
public void testFindByNomMaquillageContains ()
{
List<Maquillage> maqs=maquillageRepository.findByNomMaquillageContains("Fard à poupières");
for (Maquillage m : maqs)
{
System.out.println(m);
} }
@Test
public void testfindByNomPrix()
{
List<Maquillage> maqs = maquillageRepository.findByNomPrix("Fard à poupières", 120.5);
for (Maquillage m : maqs)
{
System.out.println(m);
}
}
@Test
public void testfindByBrand()
{
Brand brand = new Brand();
brand.setIdbrand(1L);
List<Maquillage> maqs = maquillageRepository.findByBrand(brand);
for (Maquillage m : maqs)
{
System.out.println(m);
}
}
@Test
public void findByBrandIdbrand()
{
List<Maquillage> maqs = maquillageRepository.findByBrandIdbrand(1L);
for (Maquillage m : maqs)
{
System.out.println(m);
}}

@Test
public void testfindByOrderByNomMaquillageAsc()
{
List<Maquillage> maqs =
maquillageRepository.findByOrderByNomMaquillageAsc();
for (Maquillage m : maqs)
{
System.out.println(m);
}
}

@Test
public void testTrierMaquillageNomsPrix()
{
List<Maquillage> maqs = maquillageRepository.trierMaquillageNomsPrix();
for (Maquillage m : maqs)
{
System.out.println(m);
}
}

 





}


