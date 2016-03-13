CC=gcc -std=c99 -ggdb -save-temps
CFLAGS=-Wall
CXX=g++
CXXFLAGS=-ggdb -Wall
D=./

.PRECIOUS: %.s

.SUFFIXES:

all: test_calc

%.o: %.c
	$(CC) -c -c $@ $< $(CFLAGS)

libcal.a: calc1.o calc2.o
	 ar rcs $@ $^

test_calc: test_calc.o libcalc.a
	${CC}  $(CFLAGS) -o $@ $^ -lm

.PHONY: clean

clean:
	rm -f test
	rm -f *.o *.s *.i *.so *~
	
apli:
	
	
	rmiregistry
	java -Djava.security.policy=Dsecurity.policy -Djava.rmi.server.codebase=file:D tpRMI.ProcessusB
	java -Djava.security.policy=Dsecurity.policy -Djava.rmi.server.codebase=file:D tpRMI.ProcessusA

killAll :
	kill $(java)
	kill $(rmiregistry)
