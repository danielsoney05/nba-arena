package com.nba.nba_arena.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.nba.nba_arena.repository.PlayerRepository;
import com.nba.nba_arena.model.Player;
import com.opencsv.*;

@Service
public class CSVLoaderService {
    private final PlayerRepository playerRepository;

    public CSVLoaderService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public boolean isDatabaseEmpty() {
        return playerRepository.count() == 0;
    }

    public int loadCSV(String file) throws IOException{
        ClassPathResource resource = new ClassPathResource(file);
        ArrayList<Player> players = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();){
            String[] line;
            while((line = csvReader.readNext()) != null){
                Player p = new Player();

                if (line[3].equals("2TM")) continue;

                p.setRank(parseIntSafe(line[0].trim()));
                p.setPlayer_name(line[1].trim());
                p.setAge(parseIntSafe(line[2].trim()));
                p.setTeam(line[3].trim());
                p.setPos(line[4].trim());
                p.setG(parseIntSafe(line[5].trim()));
                p.setGs(parseIntSafe(line[6].trim()));
                p.setMp(parseDoubleSafe(line[7].trim()));
                p.setFg(parseDoubleSafe(line[8].trim()));
                p.setFga(parseDoubleSafe(line[9].trim()));
                p.setFg_pct(parseDoubleSafe(line[10].trim()));
                p.setThreept(parseDoubleSafe(line[11].trim()));
                p.setThreepta(parseDoubleSafe(line[12].trim()));
                p.setThreepta_pct(parseDoubleSafe(line[13].trim()));
                p.setTwopt(parseDoubleSafe(line[14].trim()));
                p.setTwopta(parseDoubleSafe(line[15].trim()));
                p.setTwopta_pct(parseDoubleSafe(line[16].trim()));
                p.setEfg_pct(parseDoubleSafe(line[17].trim()));
                p.setFt(parseDoubleSafe(line[18].trim()));
                p.setFta(parseDoubleSafe(line[19].trim()));
                p.setFt_pct(parseDoubleSafe(line[20].trim()));
                p.setOrb(parseDoubleSafe(line[21].trim()));
                p.setDrb(parseDoubleSafe(line[22].trim()));
                p.setTrb(parseDoubleSafe(line[23].trim()));
                p.setAst(parseDoubleSafe(line[24].trim()));
                p.setStl(parseDoubleSafe(line[25].trim()));
                p.setBlk(parseDoubleSafe(line[26].trim()));
                p.setTov(parseDoubleSafe(line[27].trim()));
                p.setPf(parseDoubleSafe(line[28].trim()));
                p.setPts(parseDoubleSafe(line[29].trim()));
                p.setAwards(line[30].trim());
                p.setPlayerId(line[31].trim());
                players.add(p);
            }
        }
        playerRepository.saveAll(players);
        return players.size();
    }

    private int parseIntSafe(String value) {
        if (value == null || value.trim().isEmpty()) return 0;
        return Integer.parseInt(value.trim());
    }

    private double parseDoubleSafe(String value) {
        if (value == null || value.trim().isEmpty()) return 0.0;
        return Double.parseDouble(value.trim());
    }

}
