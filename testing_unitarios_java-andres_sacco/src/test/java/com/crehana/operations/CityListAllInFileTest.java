package com.crehana.operations;

import com.crehana.catalog.dto.CityDTO;
import com.crehana.catalog.exception.CrehanaException;
import com.crehana.catalog.persistence.CityPersistence;
import com.crehana.catalog.service.CityService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Clase que permite realizar los test en el proceso para listar todas Ciudades
 *
 * @author willmer.orsetti
 *
 */
public class CityListAllInFileTest {
    @Test
    public void should_list_all_city(){

        //when-----------------------------------------------
        CityPersistence cityPersistence=new CityPersistence();
        CityService cityService=new CityService(cityPersistence) ;

        //given-----------------------------------------------
        List<CityDTO> listCityDto= cityService.getAll();

        //then------------------------------------------------
        Assert.assertNotNull(listCityDto);
    }

    @Test
    public void should_not_list_all_city(){
        try{
            //when-----------------------------------------------
            CityPersistence cityPersistence=new CityPersistence();
            CityService cityService=new CityService(cityPersistence) ;

            //given-----------------------------------------------
            List<CityDTO> listCityDto=null;

            //then------------------------------------------------
        }catch (
        CrehanaException e){
            Assert.assertTrue(true);
        }   catch(Exception e){
            Assert.fail("wrong exception thrown");
        }
    }


}
