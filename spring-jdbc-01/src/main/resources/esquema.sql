/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jc.defrutos
 * Created: 28-dic-2016
 */

drop table if exists persona;
create table persona(
    id_persona identity primary key,
    nombre varchar(50) not null,
    ape_paterno varchar(50) not null,
    ape_materno varchar(50),
    email varchar(50) not null unique
);