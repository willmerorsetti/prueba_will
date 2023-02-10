package com.crehana.operations;

import com.crehana.catalog.dto.CityDTO;
import com.crehana.catalog.exception.CrehanaException;
import com.crehana.catalog.persistence.CityPersistence;
import com.crehana.catalog.service.CityService;
import com.crehana.catalog.validator.CityValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Clase Usa Mockito para validar Ciudad
 *
 * @author willmer.orsetti
 *
 */
public class CityUpdateInFileMockitoTest {
    @Test
    public void validador_city_Mockito(){

        CityDTO citydto= new CityDTO("NEW","New York");
        CityValidator validador=Mockito.mock(CityValidator.class);
        Mockito.when(validador.isValid(Mockito.any())).thenReturn(Boolean.TRUE);

        Assert.assertTrue(validador.isValid(citydto));
    }



}
