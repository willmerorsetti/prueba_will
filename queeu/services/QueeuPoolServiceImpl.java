package com.aleal.queeu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.Queue;
import com.aleal.queeu.util.StringBuilderPool;


@Service
public class QueeuPoolServiceImpl implements IQueeuPoolService {

	
	private StringBuilderPool sbp = new StringBuilderPool();

		
	@Override
	public String procesar() {
		Queue cola = new LinkedList<>();
		
		cola.add(1);
		cola.add(2);
		cola.add(3);
		cola.add(4);
		cola.add(5);
		cola.add(6);
		


		StringBuilder SB= new StringBuilder("Empieza....") ;
		SB.append(System.lineSeparator());
		SB.append("____________________");
		SB.append(System.lineSeparator());
		
		SB.append("Paso 1.queue: ");
		SB.append(System.lineSeparator());

		SB.append(cola);
		SB.append(System.lineSeparator());

		SB.append("____________________");
		SB.append(System.lineSeparator());

		SB.append("queue.ploo(): ");
		cola.poll();
		SB.append(System.lineSeparator());

		SB.append(cola);
		SB.append(System.lineSeparator());


        SB.append("Finaliza-QueeuPoolServiceImpl.procesar() ");

		System.out.println(SB.toString());

		return SB.toString();
	}

}