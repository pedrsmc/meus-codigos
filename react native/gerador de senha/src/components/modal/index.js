import { View, StyleSheet, Text, TouchableOpacity, Pressable } from "react-native";

export default function ModalContent({ password, close }) {
    return (

        <View style={styles.container}>
            <View style={styles.passwordBox}>
                <Text style={{ marginTop: 15, fontSize: 18, fontWeight: '500', textAlign: 'center' }}>Sua senha foi gerada!</Text>
                <Pressable style={styles.passwordField}>
                    <Text style={{ fontSize: 15, fontWeight: '500', color: '#555' }}>{password}</Text>
                </Pressable>
                <View style={styles.buttonField}>
                    <TouchableOpacity style={{ padding: 15 }} onPress={close}>
                        <Text style={{ fontWeight: '500', fontSize: 15 }}>Voltar</Text>
                    </TouchableOpacity>
                    <TouchableOpacity style={styles.button}>
                        <Text style={{ fontWeight: '500', fontSize: 15, color: '#fff' }}>Guardar</Text>
                    </TouchableOpacity>
                </View>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'rgba(0, 0, 0, 0.50)',
    },

    passwordBox: {
        backgroundColor: '#fff',
        padding: 20,
        borderRadius: 7,
        gap: 30,
    },

    passwordField: {
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#dddd',
        padding: 16,
        width: 260,
        borderRadius: 10,
    },

    buttonField: {
        flexDirection: 'row',
        justifyContent: 'space-around',
        alignItems: 'center',
    },

    button: {
        backgroundColor: '#0A337F',
        padding: 15,
        borderRadius: 7,
    },
})