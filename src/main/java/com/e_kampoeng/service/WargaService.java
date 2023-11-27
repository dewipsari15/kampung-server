package com.e_kampoeng.service;

import com.e_kampoeng.dao.WargaDao;
import com.e_kampoeng.dto.Warga;
import com.e_kampoeng.model.WargaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WargaService {

    //    ACTION
    @Autowired
    private WargaDao dataSiswaDao;
    private long id;

    //    constructor
    public WargaService() {
    }

    public WargaModel save(Warga dataWarga) {
        WargaModel data = new WargaModel();
        data.setName(dataWarga.getName());
        data.setDate_of_birth(dataWarga.getDate_of_birth());
        data.setPlace_of_birth(dataWarga.getPlace_of_birth());
        data.setReligion(dataWarga.getReligion());
        data.setGender(dataWarga.getGender());
        data.setEducational(dataWarga.getEducational());
        data.setGol_darah(dataWarga.getGol_darah());
        data.setSuitability_of_the_place(dataWarga.getSuitability_of_the_place());
        data.setNo_kk(dataWarga.getNo_kk());
        data.setNik(dataWarga.getNik());
        data.setNo_kk(dataWarga.getNo_kk());
        data.setOccupation(dataWarga.getOccupation());
        data.setStatus_in_family(dataWarga.getStatus_in_family());
        data.setMarital_status(dataWarga.getMarital_status());
        data.setResident_status(dataWarga.getResident_status());
        data.setType_of_insurance(dataWarga.getType_of_insurance());
        data.setType_of_kb(dataWarga.getType_of_kb());
        data.setWater_resources(dataWarga.getWater_resources());

        return dataSiswaDao.save(data);
    }

    //      for find by id
    public Optional<WargaModel> findById(long id) {
        return Optional.ofNullable(dataSiswaDao.findById(id));
    }

    //    for find all
    public List<WargaModel> findAll(){
        List<WargaModel> dataSiswas = new ArrayList<>();
        dataSiswaDao.findAll().forEach(dataSiswas::add);
        return dataSiswas;
    }

    //    for delete
    public void delete(long id) {
        WargaModel dataSiswa = dataSiswaDao.findById(id);
        dataSiswaDao.delete(dataSiswa);
    }

    //    for update
    public WargaModel update(Long id) {
        WargaModel dataSiswa = dataSiswaDao.findById(id);
        return dataSiswaDao.save(dataSiswa);
    }
}




