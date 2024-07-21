head ={
    "value":4,
    "next":{
        "value":5,
        "next":{
            "value":6,
            "next":{
                "value":7,
                "next":{
                    "value":8,
                    "next":None
                }
            }
        }
    }
}
print(head["next"]["next"]["value"])
print(head["next"]["next"]["next"]["value"])
print(head["next"]["next"]["next"]["next"]["value"])

