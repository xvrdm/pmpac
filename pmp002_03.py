runs = []
while True:
    today = input(
        "How long did it take to run 10km today (in minutes)?")
    if not today:
        break
    try:
        runs.append(float(today))
    except:
        print("Stick to numbers please...")


print("Average of {}, on {} race(s).".format(
    sum(runs)/len(runs), len(runs)))
