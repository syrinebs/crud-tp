package com.syrine.maquillage.service;

import java.util.List;

import com.syrine.maquillage.entities.Brand;
import com.syrine.maquillage.entities.Maquillage;

public interface MaquillageService {
Maquillage saveMaquillage(Maquillage m);
Maquillage updateMaquillage(Maquillage m);
void deleteMaquillage(Maquillage m);
void deleteMaquillageById(Long id);
Maquillage getMaquillage(Long id);
List<Maquillage> getAllMaquillage();
List<Maquillage> findByNomMaquillage(String nom);
List<Maquillage> findByNomMaquillageContains(String nom);
List<Maquillage> findByNomPrix (String nom, Double prix);
List<Maquillage> findByBrand (Brand brand);
List<Maquillage> findByBrandIdbrand(Long id);
List<Maquillage> findByOrderByNomMaquillageAsc();
List<Maquillage> trierMaquillageNomsPrix();

}
