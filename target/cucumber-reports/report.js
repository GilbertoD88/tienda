$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Registro tienda cerca",
  "description": "",
  "id": "registro-tienda-cerca",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Registrarse de forma exitosa en la tienda cerca",
  "description": "",
  "id": "registro-tienda-cerca;registrarse-de-forma-exitosa-en-la-tienda-cerca",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "que quiero registrarme en la tienda cerca ingreso a la pagina",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "selecciono la ciudad \"\u003cciudad\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "el tipo de usuario \"\u003cconsumidor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "diligencio numero telefonico \"\u003ccelular\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "acepto terminos y condiciones",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "diligencio campos \"\u003cnombre\u003e\" \"\u003capellido\u003e\" \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "seleciono la direccion \"\u003cdireccion\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Visualizo el mensaje de registro exitoso",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "registro-tienda-cerca;registrarse-de-forma-exitosa-en-la-tienda-cerca;",
  "rows": [
    {
      "cells": [
        "ciudad",
        "consumidor",
        "celular",
        "nombre",
        "apellido",
        "email",
        "direccion"
      ],
      "line": 15,
      "id": "registro-tienda-cerca;registrarse-de-forma-exitosa-en-la-tienda-cerca;;1"
    },
    {
      "cells": [
        "Bogotá",
        "Consumidor",
        "3017211000",
        "pedro pablo",
        "zapata garcia",
        "pedrozapata01@gmail.com",
        "Cra. 13 #96-67"
      ],
      "line": 16,
      "id": "registro-tienda-cerca;registrarse-de-forma-exitosa-en-la-tienda-cerca;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10564927170,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Registrarse de forma exitosa en la tienda cerca",
  "description": "",
  "id": "registro-tienda-cerca;registrarse-de-forma-exitosa-en-la-tienda-cerca;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "que quiero registrarme en la tienda cerca ingreso a la pagina",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "selecciono la ciudad \"Bogotá\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "el tipo de usuario \"Consumidor\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "diligencio numero telefonico \"3017211000\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "acepto terminos y condiciones",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "diligencio campos \"pedro pablo\" \"zapata garcia\" \"pedrozapata01@gmail.com\"",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "seleciono la direccion \"Cra. 13 #96-67\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Visualizo el mensaje de registro exitoso",
  "keyword": "Then "
});
formatter.match({
  "location": "TiendaCerca.que_quiero_registrarme_en_la_tienda_cerca_ingreso_a_la_pagina()"
});
formatter.result({
  "duration": 10407927180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bogotá",
      "offset": 22
    }
  ],
  "location": "TiendaCerca.selecciono_la_ciudad(String)"
});
formatter.result({
  "duration": 522480938,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Consumidor",
      "offset": 20
    }
  ],
  "location": "TiendaCerca.el_tipo_de_usuario(String)"
});
formatter.result({
  "duration": 158370442,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3017211000",
      "offset": 30
    }
  ],
  "location": "TiendaCerca.diligencio_numero_telefonico(String)"
});
formatter.result({
  "duration": 906133936,
  "status": "passed"
});
formatter.match({
  "location": "TiendaCerca.acepto_terminos_y_condiciones()"
});
formatter.result({
  "duration": 1500232981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pedro pablo",
      "offset": 19
    },
    {
      "val": "zapata garcia",
      "offset": 33
    },
    {
      "val": "pedrozapata01@gmail.com",
      "offset": 49
    }
  ],
  "location": "TiendaCerca.diligencio_campos(String,String,String)"
});
formatter.result({
  "duration": 586016465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cra. 13 #96-67",
      "offset": 24
    }
  ],
  "location": "TiendaCerca.seleciono_la_direccion(String)"
});
formatter.result({
  "duration": 2285848322,
  "status": "passed"
});
formatter.match({
  "location": "TiendaCerca.visualizo_el_mensaje_de_registro_exitoso()"
});
formatter.result({
  "duration": 782188921,
  "status": "passed"
});
formatter.after({
  "duration": 230436978,
  "status": "passed"
});
});