package com.nba.nba_arena.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
@IdClass(PlayerId.class)
public class Player {

    @Id
    @Column(name = "player_id", nullable = false)
    private String playerId;
    
    @Id
    @Column(name = "team", nullable = false)
    private String team;

    private int rank;
    private String player_name;
    private int age;
    private String pos;
    private int g;
    private int gs;
    private double mp;
    private double fg;
    private double fga;
    private double fg_pct;
    private double threept;
    private double threepta;
    private double threepta_pct;
    private double twopt;
    private double twopta;
    private double twopta_pct;
    private double efg_pct;
    private double ft;
    private double fta;
    private double ft_pct;
    private double orb;
    private double drb;
    private double trb;
    private double ast;
    private double stl;
    private double blk;
    private double tov;
    private double pf;
    private double pts;
    private String awards;

    public Player() {
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getGs() {
        return gs;
    }

    public void setGs(int gs) {
        this.gs = gs;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getFg() {
        return fg;
    }

    public void setFg(double fg) {
        this.fg = fg;
    }

    public double getFga() {
        return fga;
    }

    public void setFga(double fga) {
        this.fga = fga;
    }

    public double getFg_pct() {
        return fg_pct;
    }

    public void setFg_pct(double fg_pct) {
        this.fg_pct = fg_pct;
    }

    public double getThreept() {
        return threept;
    }

    public void setThreept(double threept) {
        this.threept = threept;
    }

    public double getThreepta() {
        return threepta;
    }

    public void setThreepta(double threepta) {
        this.threepta = threepta;
    }

    public double getThreepta_pct() {
        return threepta_pct;
    }

    public void setThreepta_pct(double threepta_pct) {
        this.threepta_pct = threepta_pct;
    }

    public double getTwopt() {
        return twopt;
    }

    public void setTwopt(double twopt) {
        this.twopt = twopt;
    }

    public double getTwopta() {
        return twopta;
    }

    public void setTwopta(double twopta) {
        this.twopta = twopta;
    }

    public double getTwopta_pct() {
        return twopta_pct;
    }

    public void setTwopta_pct(double twopta_pct) {
        this.twopta_pct = twopta_pct;
    }

    public double getEfg_pct() {
        return efg_pct;
    }

    public void setEfg_pct(double efg_pct) {
        this.efg_pct = efg_pct;
    }

    public double getFt() {
        return ft;
    }

    public void setFt(double ft) {
        this.ft = ft;
    }

    public double getFta() {
        return fta;
    }

    public void setFta(double fta) {
        this.fta = fta;
    }

    public double getFt_pct() {
        return ft_pct;
    }

    public void setFt_pct(double ft_pct) {
        this.ft_pct = ft_pct;
    }

    public double getOrb() {
        return orb;
    }

    public void setOrb(double orb) {
        this.orb = orb;
    }

    public double getDrb() {
        return drb;
    }

    public void setDrb(double drb) {
        this.drb = drb;
    }

    public double getTrb() {
        return trb;
    }

    public void setTrb(double trb) {
        this.trb = trb;
    }

    public double getAst() {
        return ast;
    }

    public void setAst(double ast) {
        this.ast = ast;
    }

    public double getStl() {
        return stl;
    }

    public void setStl(double stl) {
        this.stl = stl;
    }

    public double getBlk() {
        return blk;
    }

    public void setBlk(double blk) {
        this.blk = blk;
    }

    public double getTov() {
        return tov;
    }

    public void setTov(double tov) {
        this.tov = tov;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    public double getPts() {
        return pts;
    }

    public void setPts(double pts) {
        this.pts = pts;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
