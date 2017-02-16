/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.System.out;
import conexaoBanco.ConectaBancoDeDados;
import controller.AgendamentoController;
import controller.PacientesController;
import controller.VacinasController;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author Kanec
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ParseException {
        // TODO code application logic here
        ConectaBancoDeDados.getConexaoMySQL();
        out.println(ConectaBancoDeDados.statusConection());

        PacientesController p = new PacientesController();

        Paciente pac = new Paciente();
        pac.setNome("fghbfgbf");
        pac.setSobrenome("ututeqeqweyut");
        pac.setRg(5353432);
        pac.setCpf(5346778);
        pac.setEmail("%%$$$$$");
        pac.setEndereco("fsfghhn");
        //pac.setId(3);
        p.inserirPaciente(pac);
        //p.excluirPaciente(pac);
        //p.atualizarPaciente(pac);
        //p.mostrarPaciente(pac);
        //p.resetarSenha(pac);

        VacinasController v = new VacinasController();
        Vacinas vac = new Vacinas();
        vac.setDataValidade(new Date (2000 - 12 - 31));
        vac.setDataFabricacao(new Date(2000 - 12 - 31));
        vac.setNome("Aasw");
        vac.setTipo("Bfsd");
        vac.setQuantidade(14523);
        vac.setLote("0x2542942423s8");
        //vac.setId(4);
        v.inserirVacina(vac);
        //v.atualizarVacina(vac);
        //v.excluirVacina(vac);
        //v.mostrarVacina(vac);

        AgendamentoController a = new AgendamentoController();
        Agendamento ag = new Agendamento();
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String data = "15/02/2017";
        Date dataFinal = df.parse(data);
        
        //LocalDate date = LocalDate.of(2000, 1, 15);
        //ag.setDataDose(new Date(22-3-1969));
        //ag.setId(3);
        //a.inserirAgendamento(vac, pac, ag);
        //a.atualizarAgendamentoDia(ag);
        //a.atualizarAgendamentoVacina(vac, ag);
        //a.excluirAgendamento(ag);
        //a.mostrarAgendamento(ag);
    }

}
