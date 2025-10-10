package aula6;

public class ExemploEnum {
    enum DiaSemana {
        SEGUNDA {
            @Override
            public String getMensagem() {
                return "Começo da semana";
            }
        },
        TERCA {
            @Override
            public String getMensagem() {
                return "Vamos com tudo";
            }
        },
        QUARTA {
            @Override
            public String getMensagem() {
                return "Metade da semana";
            }
        },
        QUINTA {
            @Override
            public String getMensagem() {
                return "Quase la";
            }
        },
        SEXTA {
            @Override
            public String getMensagem() {
                return "Sextou";
            }
        },
        SABADO {
            @Override
            public String getMensagem() {
                return "Descanso merecido";
            }
        },
        DOMINGO {
            @Override
            public String getMensagem() {
                return "Recarregando as energias";
            }
        };

        private String mensagem;


        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }
    }

    public static void main(String[] args) {
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia + ": " + dia.getMensagem());
        }
    }
}