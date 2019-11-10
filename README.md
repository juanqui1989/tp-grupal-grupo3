# tp-grupal-grupo3

<div align="center"><img src="https://refactoring.guru/images/patterns/content/chain-of-responsibility/chain-of-responsibility.png" height="300" width="350"></div>

## ar.edu.unahur.Cliente
Se pide modelar un cliente el cual desea hacer la compra de un auto, para ello el cliente contara con una suma de dinero la cual  le perimitira o no comprar el vehiculo deseado. 
En caso de no contar con el dinero suficiente para comprarlo, dicho cliente podra contar con la opcio de solicitar un prestamo al banco en que se encuentra afilado.


## Rodados

- **Chevrolet Corsa**. <br>
  - La capacidad de estos ar.edu.unahur.autos es de 4 pasajeros, su velocidad máxima 150 km/h, y pesan 1300 kg. <br>

- **Renault Kwid** que funcionan _a gas_. 
  Cada uno de ellos puede tener puesto, o no, un tanque adicional. 
  - La capacidad de un Kwid es de 4 pasajeros si no tiene puesto el tanque adicional, o 3 pasajeros si lo tiene puesto.
  - La velocidad máxima es 120 km/h con, o 110 km/h sin, tanque adicional.
   <br>


## ar.edu.unahur.Banco

Estamos realizando el software para un banco y uno de los puntos más importantes es saber quién puede aprobar un crédito. Por lo tanto el banco define las siguientes reglas de negocio:

- **Ejecutivo**
  - Si el monto no supera los $ 10.000 entonces el ejecutivo de cuenta pueda aprobar el préstamo.
- **Lider Ejecutivo**
  - Si el monto esta entre los $10.000 y $50.000 entonces la persona indicada para realizar la aprobación es el líder ejecutivo de cuentas.
- **Gerente**
  - Si el monto se encuentra entre $ 50.000 y $100.000 entonces es el Gerente quién debe realizar dicha aprobación.
- **Director**
  - Por montos superiores a los $100.000 entonces la aprobación la realizará el Director.
