package com.syrine.maquillage.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syrine.maquillage.entities.Brand;
import com.syrine.maquillage.entities.Maquillage;
import com.syrine.maquillage.repos.MaquillageRepository;
@Service
public class MaquillageServiceImpl implements MaquillageService {
@Autowired
MaquillageRepository maquillageRepository;
@Override
public Maquillage saveMaquillage(Maquillage m) {
	return maquillageRepository.save(m);
	}
	@Override
	public Maquillage updateMaquillage(Maquillage m) {
	return maquillageRepository.save(m);
	}
	@Override
	public void deleteMaquillage(Maquillage m) {
	maquillageRepository.delete(m);
	}
	 @Override
	public void deleteMaquillageById(Long id) {
	maquillageRepository.deleteById(id);
	}
	@Override
	public Maquillage getMaquillage(Long id) {
	return maquillageRepository.findById(id).get();
	}
	@Override
	public List<Maquillage> getAllMaquillage() {
	return maquillageRepository.findAll();
	}
	
	@Override
	public List<Maquillage> findByNomMaquillage(String nom) {
		return maquillageRepository.findByNomMaquillage(nom);
	}
	@Override
	public List<Maquillage> findByNomMaquillageContains(String nom) {
		return maquillageRepository.findByNomMaquillageContains(nom);
	}
	@Override
	public List<Maquillage> findByNomPrix(String nom, Double prix) {
		return maquillageRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Maquillage> findByBrand(Brand brand) {
		return maquillageRepository.findByBrand(brand);

	}
	@Override
	public List<Maquillage> findByBrandIdbrand(Long id) {
		return maquillageRepository.findByBrandIdbrand(id);
	}
	@Override
	public List<Maquillage> findByOrderByNomMaquillageAsc() {
		return maquillageRepository.findByOrderByNomMaquillageAsc();
	}
	@Override
	public List<Maquillage> trierMaquillageNomsPrix() {
		return maquillageRepository.trierMaquillageNomsPrix();

	}
	
	
	}