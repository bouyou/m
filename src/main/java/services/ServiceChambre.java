package services;

import entities.Chambre;
import entities.ChambreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class ServiceChambre {


   public final ChambreRepository _repo;

    public ServiceChambre(ChambreRepository repo) {

        this._repo = repo;
    }

    public List<Chambre> test(){
        List<Chambre> tot = _repo.findAll();
        return _repo.findAll();
    }
}
