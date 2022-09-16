from email.mime import application
from unicodedata import name
import pymysql
import os

class App:
    def __init__(self): 
        self.conn=pymysql.connect(
            host='localhost',
            user='root',
            passwd='CashClik6060',
            db='digifin'
        )
        #self.cursor=self.conn.cursor()


    def consultar(self):
        try:
            conexion = pymysql.connect(         
                host='localhost',
                user='root',
                passwd='CashClik6060',
                db='digifin'
                )
            try:
                with conexion.cursor() as cursor:
                    # En este caso no necesitamos limpiar ningún dato
                    cursor.execute("SELECT nombre FROM persona;")
        
                    # Con fetchall traemos todas las filas
                    personas = cursor.fetchall()
        
                    # Recorrer e imprimir
                    for persona in personas:
                        print(persona)
            finally:
                conexion.close()
            
        except (pymysql.err.OperationalError, pymysql.err.InternalError) as e:
            print("Ocurrió un error al conectar: ", e)

    def isertar2(self):
        print('----------------------------------------------Insertando...')
        name2=input('Ingrese nombre:/n')
        try:
            conexion = pymysql.connect(
                    host='localhost',
                    user='root',
                    passwd='CashClik6060',
                    db='digifin'#,
                # port=3308
                )
            try:
                
                with conexion.cursor() as cursor:
                    consulta = "INSERT INTO persona(nombre) VALUES (%s);"
                    #Podemos llamar muchas veces a .execute con datos distintos      cursor.execute(consulta, ("Papi2"))    
                    cursor.execute(consulta, (name2))
                conexion.commit()
        
            finally:
                conexion.close()

        except (pymysql.err.OperationalError, pymysql.err.InternalError) as e:
            print("Ocurrió un error al conectar: ", e)


    def delete_all(self):
        print('----------------------------------------------del...')
        
        try:
            conexion = pymysql.connect(
                    host='localhost',
                    user='root',
                    passwd='CashClik6060',
                    db='digifin'#,
                # port=3308
                )
            try:
                
                with conexion.cursor() as cursor:
                    consulta = "delete from persona;"
                    #Podemos llamar muchas veces a .execute con datos distintos      
                    cursor.execute(consulta)
                conexion.commit()
        
            finally:
                conexion.close()

        except (pymysql.err.OperationalError, pymysql.err.InternalError) as e:
            print("Ocurrió un error al conectar: ", e)





    def update(self):
        print('----------------------------------------------Update...')
        name3=input('Ingrese nombre a buscar:/n')
        name2=input('Ingrese nombre A cambiar:/n')
        print('----------------------------------------------Update...')
        try:
            conexion = pymysql.connect(
                host='localhost',
                user='root',
                passwd='CashClik6060',
                db='digifin'#,
                # port=3308
                )
            try:
                with conexion.cursor() as cursor:
                    
                    consulta = "UPDATE persona SET nombre = %s WHERE nombre = %s;"

                    
                    cursor.execute(consulta, (name2,name3))
        
                # No olvidemos hacer commit cuando hacemos un cambio a la BD
                conexion.commit()
            finally:
                conexion.close()
            
        except (pymysql.err.OperationalError, pymysql.err.InternalError) as e:
            print("Ocurrió un error al conectar: ", e)




print('###########################################')
application=App()
application.isertar2()
print('--Finalizo------------Insertar-----------------------...')

print('###########################################')
application.consultar()
print('--Finalizo------------consultar-----------------------...')
print('###########################################')
application.update()
print('--Finalizo------------Update-----------------------...')
print('###########################################')
application.consultar()
print('--Finalizo------------consultar-----------------------...')

