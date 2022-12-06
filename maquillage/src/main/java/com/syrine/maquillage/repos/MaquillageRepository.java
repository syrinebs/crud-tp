package com.syrine.maquillage.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syrine.maquillage.entities.Brand;
import com.syrine.maquillage.entities.Maquillage;

@RepositoryRestResource(path = "rest")
public interface MaquillageRepository extends JpaRepository<Maquillage, Long> {
	List<Maquillage> findByNomMaquillage(String nom);
	 List<Maquillage> findByNomMaquillageContains(String nom);
	 
	 @Query("select m from Maquillage m where m.nomMaquillage like %?1 and m.prixMaquillage > ?2")
	 List<Maquillage> findByNomPrix (String nom, Double prix);
	 
	 @Query("select m from Maquillage m where m.brand = ?1")
	 List<Maquillage> findByBrand (Brand brand);

	 List<Maquillage> findByBrandIdbrand(Long id);
	 
	 List<Maquillage> findByOrderByNomMaquillageAsc();
	 
	 @Query("select m from Maquillage m order by m.nomMaquillage ASC, m.prixMaquillage DESC")
	 List<Maquillage> trierMaquillageNomsPrix ();




}



