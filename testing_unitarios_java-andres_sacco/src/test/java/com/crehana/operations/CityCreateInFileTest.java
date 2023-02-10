package com.crehana.operations;

import com.crehana.catalog.exception.CrehanaException;
import org.junit.Assert;
import org.junit.Test;
import com.crehana.catalog.service.CityService;
import com.crehana.catalog.dto.CityDTO;
import com.crehana.catalog.persistence.CityPersistence;

/**
 * Clase que permite realizar los test en el proceso para crear  Ciudad
 *
 * @author willmer.orsetti
 *
 */
public class CityCreateInFileTest {
    @Test
    public void should_create_city_monterrey(){

        //when-----------------------------------------------
        CityDTO cityDTO=new CityDTO("PAR","Paris");
        CityPersistence cityPersistence=new CityPersistence();
        CityService cityService=new CityService(cityPersistence) ;

        //given-----------------------------------------------
        cityPersistence.create(cityDTO);

        //then------------------------------------------------
        //Se valida se crea la ciudad Paris
        Assert.assertEquals("PAR", cityService.existCity("PAR").get().getCode());
    }

    @Test
    public void should_not_create_city_mex(){
        try {
            //when-----------------------------------------------
            CityDTO cityDTO=new CityDTO("MEX","Ciudad de México");
            CityPersistence cityPersistence=new CityPersistence();
            CityService cityService=new CityService(cityPersistence) ;

            //given-----------------------------------------------
            cityPersistence.create(cityDTO);

            //then------------------------------------------------
            //Se valida se crea la ciudad Paris
        }catch (CrehanaException e){
            Assert.assertTrue(true);
        }   catch(Exception e){
            Assert.fail("wrong exception thrown");
        }
    }

    @Test
    public void should_not_create_city_par_de_nuevo(){
        try {
            //when-----------------------------------------------
            CityDTO cityDTO = new CityDTO("PAR", "Barcelona");
            CityPersistence cityPersistence = new CityPersistence();
            CityService cityService = new CityService(cityPersistence);

            //given-----------------------------------------------
            cityPersistence.create(cityDTO);

            //then------------------------------------------------
            //Se valida se crea la ciudad Paris
        }catch (CrehanaException e){
            Assert.assertTrue(true);
        }   catch(Exception e){
            Assert.fail("wrong exception thrown");
        }
    }
}
