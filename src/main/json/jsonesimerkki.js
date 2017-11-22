// Esimerkki JSON objekti

var kyselytJSON = {
  "kyselyt": [{
      "name": "kysely1",
      "kysymykset": ["kysely1 kysymys1", "kysely1 kysymys2"]
       },

    {
        "name": "kysely2",
        "kysymykset": ["kysely2 kysymys1", "kysely2 kysymys2"]
    }
]

};


// Esimerkki haku for-loopeilla

var kyselytArray = kyselytJSON.kyselyt;

for (var i = 0; i < kyselytArray.length; i++) {
    for (var j = 0; j < kyselytArray[i].kysymykset.length; j++) {
        console.log(kyselytArray[i].kysymykset[j]);
    }
}
