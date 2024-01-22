
db.createCollection( 'client', {validator: {$jsonSchema: {bsonType: 'object',title:'client',required: [         'nom',          'adreca',          'telefon',          'email',          'data_registra'],properties: {nom: {bsonType: 'string'},adreca: {bsonType: 'object',
title:'object',required: [         'carrer',          'numero',          'ciutat',          'cp',          'pais'],properties: {carrer: {bsonType: 'string'},numero: {bsonType: 'int'},pis: {bsonType: 'int'},porta: {bsonType: 'int'},ciutat: {bsonType: 'string'},cp: {bsonType: 'int'},pais: {bsonType: 'string'}}},telefon: {bsonType: 'int'},email: {bsonType: 'string'},data_registra: {bsonType: 'date'},venta: {bsonType: 'object',
title:'object',properties: {ulleres: {bsonType: 'object',
title:'object',required: [         'marca',          'tipus_montura',          'color_montura',          'color_vidre',          'preu'],properties: {marca: {bsonType: 'string'},graduacion: {bsonType: 'object',
title:'object',properties: {dreta: {bsonType: 'double'},esquerra: {bsonType: 'double'}}},tipus_montura: {enum: ('flotant', 'metal·lica','pasta')},color_montura: {bsonType: 'string'},color_vidre: {bsonType: 'object',
title:'object',required: [         'dreta',          'esquerra'],properties: {dreta: {bsonType: 'string'},esquerra: {bsonType: 'string'}}},preu: {bsonType: 'double'}}}}}}         }      }});  