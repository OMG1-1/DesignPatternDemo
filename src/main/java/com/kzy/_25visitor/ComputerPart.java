package com.kzy._25visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}