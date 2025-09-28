package org.sahilo.SOLIDPrinciples.ISP.BadCode;

//Monolithic Machine Interface
public interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void copy(Document doc);
}
