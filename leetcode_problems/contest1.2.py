'''
For example, let's say you have magicians with energies [5, 2, -10, -5, 1] 
and the teleport distance 'k' is 3. If you start from the first magician (index 0),
 you'll gather 5 energy from them, teleport to the magician at index 3 (-5 energy), 
 then teleport to the end (no more teleporting possible). In total, you'd have 5 - 5 + 1 = 1 energy
 . But, if you start from the second magician (index 1), you'll gather 2 energy, teleport to 
 index 4 (1 energy), and then you can't teleport anymore, giving you a total of 2 + 1 = 3 energy,
   which is the maximum in this case.'''
energy = [-2,-4]


k = 1
'''maxene=[]
def all_negative(array):
    for num in array:
        if num >= 0:
            return False
    return True
if(all_negative(energy)):
    print(max(energy))
else:
    for i in range(0,len(energy)):
        total_energy = 0
        for j in range(i, len(energy), k):  
            total_energy += energy[j]  

        maxene.append(total_energy)
    print(max(maxene))

'''
max_energy = float('-inf')  # Initialize max_energy to negative infinity
for i in range(len(energy)):  # Iterate through all potential starting points
        total_energy = 0
        j = i
        while j < len(energy):  # Continue teleporting until the end of the magicians' sequence
            total_energy += energy[j]  # Absorb energy from the magician
            j += k  # Teleport to the next magician

        max_energy = max(max_energy, total_energy)  # Update max_energy if necessary

print(max_energy)
