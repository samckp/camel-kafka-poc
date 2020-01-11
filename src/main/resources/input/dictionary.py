thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(thisdict)


print("\n--------------print keys")
for x in thisdict:
    print(x)

print("\n------------print Values")

for x in thisdict:
    print(x  , "  >  " , thisdict[x])


# Loop through both keys and values, by using the items() function:
print("\nPrint  using the items() function:")
for x, y in thisdict.items():
  print(x, y)

print("---------------------Adding Item ")
thisdict["color"] = "red"
print(thisdict)

print("\ncheck Key is exist or not in dictionary ")
if "model" in thisdict:
    print("Yes, 'model' is one of the keys in the thisdict dictionary")


print("\nMake a copy of a dictionary with the dict() method:")

thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
mydict = dict(thisdict)
print(mydict)

print("\n Insert items using dict constructor")
thisdict = dict(brand="Ford", model="Mustang", year=1964)
thisdict = dict(brand="Tata", model="Nexon", year=2018)
print(thisdict)
