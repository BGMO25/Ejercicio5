/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica0301;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel4 extends JFrame{
    private final JPanel jpanelprincipal;
    private final JPanel jpanelBandera;
    private final ArrayList<JPanel> jpanelList;
    private final ArrayList<JPanel> jpanelBanderaList;

    public Panel4(String title, int ancho, int alto, int posX, int posY) {
        this.setTitle(title);
        this.jpanelprincipal = new JPanel();
        this.jpanelBandera = new JPanel();
        this.jpanelList = new ArrayList<>();
        this.jpanelBanderaList = new ArrayList<>();
        this.setSize(ancho,alto);
        this.setLocation(posX, posY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanelprincipal);
        iniciarComponentesBandera();
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.jpanelprincipal.setLayout(new BorderLayout());
        jpanelList.add(new JPanel());
        jpanelList.add(new JPanel());
        jpanelList.add(new JPanel());
        jpanelList.add(new JPanel());
        jpanelList.add(new JPanel());
        
        jpanelprincipal.add(jpanelList.get(0), BorderLayout.NORTH);
        jpanelprincipal.add(jpanelList.get(1), BorderLayout.EAST);
        jpanelprincipal.add(jpanelList.get(2), BorderLayout.CENTER);
        jpanelprincipal.add(jpanelList.get(3), BorderLayout.WEST);
        jpanelprincipal.add(jpanelList.get(4), BorderLayout.SOUTH);
        
        jpanelList.get(0).add(new JLabel("Button 1"));
        jpanelList.get(1).add(new JLabel("Button 5"));
        jpanelList.get(2).add(jpanelBandera);
        jpanelList.get(3).add(new JLabel("Button 3"));
        jpanelList.get(4).add(new JLabel("Long_Named Button 4"));
        
    }
    
    
    private void iniciarComponentesBandera(){
        
        
        jpanelBanderaList.add(new JPanel()); 
        
        for (int i = 0; i < 240; i++) {
            jpanelBanderaList.add(new JPanel());
        }
         
       
        jpanelBanderaList.get(0).setLayout(new GridLayout(12,20));
        
        jpanelBanderaList.get(1).setBackground(Color.RED);
        jpanelBanderaList.get(2).setBackground(Color.RED);
        jpanelBanderaList.get(3).setBackground(Color.RED);
        jpanelBanderaList.get(4).setBackground(Color.RED);
        jpanelBanderaList.get(5).setBackground(Color.WHITE);
        jpanelBanderaList.get(6).setBackground(Color.BLUE);
        jpanelBanderaList.get(7).setBackground(Color.BLUE);
        jpanelBanderaList.get(8).setBackground(Color.WHITE);
        jpanelBanderaList.get(9).setBackground(Color.RED);
        jpanelBanderaList.get(10).setBackground(Color.RED);
        jpanelBanderaList.get(11).setBackground(Color.RED);
        jpanelBanderaList.get(12).setBackground(Color.RED);
        jpanelBanderaList.get(13).setBackground(Color.RED);
        jpanelBanderaList.get(14).setBackground(Color.RED);
        jpanelBanderaList.get(15).setBackground(Color.RED);
        jpanelBanderaList.get(16).setBackground(Color.RED);
        jpanelBanderaList.get(17).setBackground(Color.RED);
        jpanelBanderaList.get(18).setBackground(Color.RED);
        jpanelBanderaList.get(19).setBackground(Color.RED);
        jpanelBanderaList.get(20).setBackground(Color.RED);
        jpanelBanderaList.get(21).setBackground(Color.RED);
        jpanelBanderaList.get(22).setBackground(Color.RED);
        jpanelBanderaList.get(23).setBackground(Color.RED);
        jpanelBanderaList.get(24).setBackground(Color.RED);
        jpanelBanderaList.get(25).setBackground(Color.WHITE);
        jpanelBanderaList.get(26).setBackground(Color.BLUE);
        jpanelBanderaList.get(27).setBackground(Color.BLUE);
        jpanelBanderaList.get(28).setBackground(Color.WHITE);
        jpanelBanderaList.get(29).setBackground(Color.RED);
        jpanelBanderaList.get(30).setBackground(Color.RED);
        jpanelBanderaList.get(31).setBackground(Color.RED);
        jpanelBanderaList.get(32).setBackground(Color.RED);
        jpanelBanderaList.get(33).setBackground(Color.RED);
        jpanelBanderaList.get(34).setBackground(Color.RED);
        jpanelBanderaList.get(35).setBackground(Color.RED);
        jpanelBanderaList.get(36).setBackground(Color.RED);
        jpanelBanderaList.get(37).setBackground(Color.RED);
        jpanelBanderaList.get(38).setBackground(Color.RED);
        jpanelBanderaList.get(39).setBackground(Color.RED);
        jpanelBanderaList.get(40).setBackground(Color.RED);
        jpanelBanderaList.get(41).setBackground(Color.RED);
        jpanelBanderaList.get(42).setBackground(Color.RED);
        jpanelBanderaList.get(43).setBackground(Color.RED);
        jpanelBanderaList.get(44).setBackground(Color.RED);
        jpanelBanderaList.get(45).setBackground(Color.WHITE);
        jpanelBanderaList.get(46).setBackground(Color.BLUE);
        jpanelBanderaList.get(47).setBackground(Color.BLUE);
        jpanelBanderaList.get(48).setBackground(Color.WHITE);
        jpanelBanderaList.get(49).setBackground(Color.RED);
        jpanelBanderaList.get(50).setBackground(Color.RED);
        jpanelBanderaList.get(51).setBackground(Color.RED);
        jpanelBanderaList.get(52).setBackground(Color.RED);
        jpanelBanderaList.get(53).setBackground(Color.RED);
        jpanelBanderaList.get(54).setBackground(Color.RED);
        jpanelBanderaList.get(55).setBackground(Color.RED);
        jpanelBanderaList.get(56).setBackground(Color.RED);
        jpanelBanderaList.get(57).setBackground(Color.RED);
        jpanelBanderaList.get(58).setBackground(Color.RED);
        jpanelBanderaList.get(59).setBackground(Color.RED);
        jpanelBanderaList.get(60).setBackground(Color.RED);
        jpanelBanderaList.get(61).setBackground(Color.RED);
        jpanelBanderaList.get(62).setBackground(Color.RED);
        jpanelBanderaList.get(63).setBackground(Color.RED);
        jpanelBanderaList.get(64).setBackground(Color.RED);
        jpanelBanderaList.get(65).setBackground(Color.WHITE);
        jpanelBanderaList.get(66).setBackground(Color.BLUE);
        jpanelBanderaList.get(67).setBackground(Color.BLUE);
        jpanelBanderaList.get(68).setBackground(Color.WHITE);
        jpanelBanderaList.get(69).setBackground(Color.RED);
        jpanelBanderaList.get(70).setBackground(Color.RED);
        jpanelBanderaList.get(71).setBackground(Color.RED);
        jpanelBanderaList.get(72).setBackground(Color.RED);
        jpanelBanderaList.get(73).setBackground(Color.RED);
        jpanelBanderaList.get(74).setBackground(Color.RED);
        jpanelBanderaList.get(75).setBackground(Color.RED);
        jpanelBanderaList.get(76).setBackground(Color.RED);
        jpanelBanderaList.get(77).setBackground(Color.RED);
        jpanelBanderaList.get(78).setBackground(Color.RED);
        jpanelBanderaList.get(79).setBackground(Color.RED);
        jpanelBanderaList.get(80).setBackground(Color.RED);
        jpanelBanderaList.get(81).setBackground(Color.WHITE);
        jpanelBanderaList.get(82).setBackground(Color.WHITE);
        jpanelBanderaList.get(83).setBackground(Color.WHITE);
        jpanelBanderaList.get(84).setBackground(Color.WHITE);
        jpanelBanderaList.get(85).setBackground(Color.WHITE);
        jpanelBanderaList.get(86).setBackground(Color.BLUE);
        jpanelBanderaList.get(87).setBackground(Color.BLUE);
        jpanelBanderaList.get(88).setBackground(Color.WHITE);
        jpanelBanderaList.get(89).setBackground(Color.WHITE);
        jpanelBanderaList.get(90).setBackground(Color.WHITE);
        jpanelBanderaList.get(91).setBackground(Color.WHITE);
        jpanelBanderaList.get(92).setBackground(Color.WHITE);
        jpanelBanderaList.get(93).setBackground(Color.WHITE);
        jpanelBanderaList.get(94).setBackground(Color.WHITE);
        jpanelBanderaList.get(95).setBackground(Color.WHITE);
        jpanelBanderaList.get(96).setBackground(Color.WHITE);
        jpanelBanderaList.get(97).setBackground(Color.WHITE);
        jpanelBanderaList.get(98).setBackground(Color.WHITE);
        jpanelBanderaList.get(99).setBackground(Color.WHITE);
        jpanelBanderaList.get(100).setBackground(Color.WHITE);
        
       
        for (int i = 101; i <= 140; i++) {
            jpanelBanderaList.get(i).setBackground(Color.BLUE);
        }
      
       
        
        jpanelBanderaList.get(141).setBackground(Color.WHITE);
        jpanelBanderaList.get(142).setBackground(Color.WHITE);
        jpanelBanderaList.get(143).setBackground(Color.WHITE);
        jpanelBanderaList.get(144).setBackground(Color.WHITE);
        jpanelBanderaList.get(145).setBackground(Color.WHITE);
        jpanelBanderaList.get(146).setBackground(Color.BLUE);
        jpanelBanderaList.get(147).setBackground(Color.BLUE);
        jpanelBanderaList.get(148).setBackground(Color.WHITE);
        jpanelBanderaList.get(149).setBackground(Color.WHITE);
        jpanelBanderaList.get(150).setBackground(Color.WHITE);
        jpanelBanderaList.get(151).setBackground(Color.WHITE);
        jpanelBanderaList.get(152).setBackground(Color.WHITE);
        jpanelBanderaList.get(153).setBackground(Color.WHITE);
        jpanelBanderaList.get(154).setBackground(Color.WHITE);
        jpanelBanderaList.get(155).setBackground(Color.WHITE);
        jpanelBanderaList.get(156).setBackground(Color.WHITE);
        jpanelBanderaList.get(157).setBackground(Color.WHITE);
        jpanelBanderaList.get(158).setBackground(Color.WHITE);
        jpanelBanderaList.get(159).setBackground(Color.WHITE);
        jpanelBanderaList.get(160).setBackground(Color.WHITE);
        jpanelBanderaList.get(161).setBackground(Color.RED);
        jpanelBanderaList.get(162).setBackground(Color.RED);
        jpanelBanderaList.get(163).setBackground(Color.RED);
        jpanelBanderaList.get(164).setBackground(Color.RED);
        jpanelBanderaList.get(165).setBackground(Color.WHITE);
        jpanelBanderaList.get(166).setBackground(Color.BLUE);
        jpanelBanderaList.get(167).setBackground(Color.BLUE);
        jpanelBanderaList.get(168).setBackground(Color.WHITE);
        jpanelBanderaList.get(169).setBackground(Color.RED);
        jpanelBanderaList.get(170).setBackground(Color.RED);
        jpanelBanderaList.get(171).setBackground(Color.RED);
        jpanelBanderaList.get(172).setBackground(Color.RED);
        jpanelBanderaList.get(173).setBackground(Color.RED);
        jpanelBanderaList.get(174).setBackground(Color.RED);
        jpanelBanderaList.get(175).setBackground(Color.RED);
        jpanelBanderaList.get(176).setBackground(Color.RED);
        jpanelBanderaList.get(177).setBackground(Color.RED);
        jpanelBanderaList.get(178).setBackground(Color.RED);
        jpanelBanderaList.get(179).setBackground(Color.RED);
        jpanelBanderaList.get(180).setBackground(Color.RED);
        jpanelBanderaList.get(181).setBackground(Color.RED);
        jpanelBanderaList.get(182).setBackground(Color.RED);
        jpanelBanderaList.get(183).setBackground(Color.RED);
        jpanelBanderaList.get(184).setBackground(Color.RED);
        jpanelBanderaList.get(185).setBackground(Color.WHITE);
        jpanelBanderaList.get(186).setBackground(Color.BLUE);
        jpanelBanderaList.get(187).setBackground(Color.BLUE);
        jpanelBanderaList.get(188).setBackground(Color.WHITE);
        jpanelBanderaList.get(189).setBackground(Color.RED);
        jpanelBanderaList.get(190).setBackground(Color.RED);
        jpanelBanderaList.get(191).setBackground(Color.RED);
        jpanelBanderaList.get(192).setBackground(Color.RED);
        jpanelBanderaList.get(193).setBackground(Color.RED);
        jpanelBanderaList.get(194).setBackground(Color.RED);
        jpanelBanderaList.get(195).setBackground(Color.RED);
        jpanelBanderaList.get(196).setBackground(Color.RED);
        jpanelBanderaList.get(197).setBackground(Color.RED);
        jpanelBanderaList.get(198).setBackground(Color.RED);
        jpanelBanderaList.get(199).setBackground(Color.RED);
        jpanelBanderaList.get(200).setBackground(Color.RED);
        jpanelBanderaList.get(201).setBackground(Color.RED);
        jpanelBanderaList.get(202).setBackground(Color.RED);
        jpanelBanderaList.get(203).setBackground(Color.RED);
        jpanelBanderaList.get(204).setBackground(Color.RED);
        jpanelBanderaList.get(205).setBackground(Color.WHITE);
        jpanelBanderaList.get(206).setBackground(Color.BLUE);
        jpanelBanderaList.get(207).setBackground(Color.BLUE);
        jpanelBanderaList.get(208).setBackground(Color.WHITE);
        jpanelBanderaList.get(209).setBackground(Color.RED);
        jpanelBanderaList.get(210).setBackground(Color.RED);
        jpanelBanderaList.get(211).setBackground(Color.RED);
        jpanelBanderaList.get(212).setBackground(Color.RED);
        jpanelBanderaList.get(213).setBackground(Color.RED);
        jpanelBanderaList.get(214).setBackground(Color.RED);
        jpanelBanderaList.get(215).setBackground(Color.RED);
        jpanelBanderaList.get(216).setBackground(Color.RED);
        jpanelBanderaList.get(217).setBackground(Color.RED);
        jpanelBanderaList.get(218).setBackground(Color.RED);
        jpanelBanderaList.get(219).setBackground(Color.RED);
        jpanelBanderaList.get(220).setBackground(Color.RED);
        jpanelBanderaList.get(221).setBackground(Color.RED);
        jpanelBanderaList.get(222).setBackground(Color.RED);
        jpanelBanderaList.get(223).setBackground(Color.RED);
        jpanelBanderaList.get(224).setBackground(Color.RED);
        jpanelBanderaList.get(225).setBackground(Color.WHITE);
        jpanelBanderaList.get(226).setBackground(Color.BLUE);
        jpanelBanderaList.get(227).setBackground(Color.BLUE);
        jpanelBanderaList.get(228).setBackground(Color.WHITE);
        jpanelBanderaList.get(229).setBackground(Color.RED);
        jpanelBanderaList.get(230).setBackground(Color.RED);
        jpanelBanderaList.get(231).setBackground(Color.RED);
        jpanelBanderaList.get(232).setBackground(Color.RED);
        jpanelBanderaList.get(233).setBackground(Color.RED);
        jpanelBanderaList.get(234).setBackground(Color.RED);
        jpanelBanderaList.get(235).setBackground(Color.RED);
        jpanelBanderaList.get(236).setBackground(Color.RED);
        jpanelBanderaList.get(237).setBackground(Color.RED);
        jpanelBanderaList.get(238).setBackground(Color.RED);
        jpanelBanderaList.get(239).setBackground(Color.RED);
        jpanelBanderaList.get(240).setBackground(Color.RED);
        
        for (int i = 1; i <= 240; i++) {
            jpanelBanderaList.get(0).add(jpanelBanderaList.get(i));
        }
        
        jpanelBandera.add(jpanelBanderaList.get(0));
        
    }
}