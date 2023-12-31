package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.Orden;
import com.ventas.ecomerce.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    @Override
    public List<Orden> findAll() {
        return ordenRepository.findAll();
    }

    @Override
    public Orden save(Orden orden) {
        return ordenRepository.save(orden);
    }

    public String generarNumeroOrden(){
        int numero=1;
        String numeroConcatenado="";
        List<Orden> ordenes=findAll();

        List<Integer> numeros= new ArrayList<>();

        ordenes.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));
        if(ordenes.isEmpty()){
            numero=1;
        }else {
            numero=numeros.stream().max(Integer::compare).get();
            numero++;

        }
        if(numero<10){
            numeroConcatenado="000000000"+String.valueOf(numero);
        } else if (numero<100) {
            numeroConcatenado="00000000"+String.valueOf(numero);
        } else if (numero<1000) {
            numeroConcatenado="0000000"+String.valueOf(numero);
        } else if (numero<10000) {
            numeroConcatenado="0000000"+String.valueOf(numero);

        }
        return numeroConcatenado;
    }
}
