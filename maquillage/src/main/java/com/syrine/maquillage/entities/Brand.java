package com.syrine.maquillage.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Brand {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idbrand;
private String nomBrand;
private String descriptionBrand;
@JsonIgnore
@OneToMany(mappedBy = "brand")
private List<Maquillage> maquillage;
}
