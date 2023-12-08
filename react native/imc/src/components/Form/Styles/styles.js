import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
    container: {
        height: '100%',
        width: '100%',
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },

    text: {
        fontWeight: '500',
        fontSize: 20,
        color: '#000',
        marginBottom: 30,
    },

    topBox: {
        display: 'flex',
        justifyContent: 'flex-end',
        flex: 1,
    },

    mainBox: {
        alignItems: 'center',
        width: '100%',
        flex: 2,
        backgroundColor: '#eeeeee',
        borderTopLeftRadius: 50,
        borderTopRightRadius: 50
    },

    inputField: {
        display: 'flex',
        gap: 10,
    },

    inputBox: {
        marginTop: 30,
        display: 'flex',
        flexDirection: 'column',
        gap: 30,
    },

    input: {
        width: 250,
        backgroundColor: '#cccccc',
        padding: 10,
        borderRadius: 10,
    },

    buttonField: {
        marginTop: 20,
    },

    buttonText: {
        color: '#fff',
        fontWeight: '800',
    },

    button: {
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        height: 50,
        width: 250,
        backgroundColor: '#000',
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 5,
        },
        shadowOpacity: 0.36,
        shadowRadius: 6.68,
        elevation: 11,
        borderRadius: 10,
    },

    resultField: {
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
    },

    resultText2: {
        fontWeight: '500',
    },

    resultText: {
        fontWeight: '500',
        fontSize: 50,
    },

});

export default styles