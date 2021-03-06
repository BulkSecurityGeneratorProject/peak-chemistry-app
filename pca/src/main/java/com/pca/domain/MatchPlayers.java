package com.pca.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PCA_MATCH_PLAYERS")
public class MatchPlayers extends DefaultModel implements Serializable{

	@ManyToOne
	@JoinColumn(name = "PLAYER_ID")
	private Player players;
	
	@ManyToOne
	@JoinColumn(name = "MATCH_ID")
	private Matches matches;

	public MatchPlayers() {
		
	}

	public MatchPlayers(Player players, Matches matches) {
		super();
		this.players = players;
		this.matches = matches;
	}

	public Player getPlayers() {
		return players;
	}

	public void setPlayers(Player players) {
		this.players = players;
	}

	public Matches getMatches() {
		return matches;
	}

	public void setMatches(Matches matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "MatchPlayers [players=" + players + ", matches=" + matches
				+ "]";
	}
	
	
}
